/*
 * Copyright 2017  the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.gofannon.recalboxpatcher.patcher.model.image;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.IOFileFilter;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

class ImageRepositoryFileFilter implements IOFileFilter {

    private static final Collection<String> acceptedFileExtensions = Arrays.asList("png");

    @Override
    public boolean accept(File file) {
        return accept(file.getName());
    }

    private boolean accept(String filename) {
        String extension = FilenameUtils.getExtension(filename).toLowerCase();
        return acceptedFileExtensions.contains(extension);
    }

    @Override
    public boolean accept(File dir, String name) {
        return accept(name);
    }
}
