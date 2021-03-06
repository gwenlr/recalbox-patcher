/*
 * Copyright 2016 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gofannon.recalboxpatcher.patcher.model.hyperspin;

import java.util.regex.Pattern;

class XmlPatcher {
    
    public static String parse(String initialXml) {
        //@formatter:off
       return Pattern.compile(initialXml)
               .splitAsStream("(?=&)")
               .map(XmlPatcher::fix)
               .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
               .toString();
       //@formatter:on
    }
    
    static String fix(String xmlExtract ) {
        if( xmlExtract.matches("\\&[a-z]+;.*"))
            return xmlExtract;
        return xmlExtract.replace("&", "&amp;");
    }

}
