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
package io.gofannon.recalboxpatcher.patcher.patch.image;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.*;

import java.awt.image.BufferedImage;

import static org.apache.commons.lang3.Validate.*;


/**
 * Simple implementation of {@link ImagePatcher}
 */
public class ResizeImagePatcher implements ImagePatcher {

    private ImageDimension dimension;

    public void setDimension(ImageDimension dimension) {
        notNull(dimension, "dimension argument shall not be null");
        this.dimension = new ImageDimension(dimension);
    }

    @Override
    public Image patchImage(Image image) {
        //TODO implement this
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
