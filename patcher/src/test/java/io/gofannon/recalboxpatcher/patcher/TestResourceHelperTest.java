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
package io.gofannon.recalboxpatcher.patcher;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;

import static io.gofannon.recalboxpatcher.patcher.TestResourceHelper.*;
import static org.assertj.core.api.Assertions.*;

public class TestResourceHelperTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void testCreateRecalboxFile() throws Exception {
        File file = new File(folder.getRoot(), "recalbox.xml");
        createRecalboxFile(file);
        assertThat( file)
                .isFile()
                .exists();
        assertThat(file.length()).
                isGreaterThan(0L);
    }

    @Test
    public void testCreateHypserspinxFile() throws Exception {
        File file = new File(folder.getRoot(), "hyperspin.xml");
        createHyperspinFile(file);
        assertThat( file)
                .isFile()
                .exists();
        assertThat(file.length()).
                isGreaterThan(0L);
    }
}