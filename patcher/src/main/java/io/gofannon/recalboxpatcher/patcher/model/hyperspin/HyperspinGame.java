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

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Scanner;
import static org.apache.commons.lang3.StringUtils.*;

public class HyperspinGame {

    private String name;
    private String description;
    private String synopsis;
    private int year;
    private String manufacturer;
    private String developer;
    private String genre;
    private String players;
    private int playerCount;

    public HyperspinGame() {
    }

    @XmlAttribute(name = "name", required = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "description", required = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name = "synopsis", required = true)
    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @XmlElement(name = "year", required = true)
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @XmlElement(name = "manufacturer", required = true)
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @XmlElement(name = "developer", required = true)
    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    @XmlElement(name = "genre", required = true)
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @XmlElement(name = "players", required = true)
    public String getPlayers() {
        return players;
    }

    public void setPlayers(String players) {
        this.players = players;
        this.playerCount = computePlayerCount();
    }

    private int computePlayerCount() {
        if( isEmpty(players))
            return 0;

        try {
            Scanner scanner = new Scanner(players);
            return Math.abs(scanner.nextInt());
        } catch(Exception ex) {
            return 0;
        }
    }

    @XmlTransient
    public int getPlayerCount() {
        return playerCount;
    }

}
