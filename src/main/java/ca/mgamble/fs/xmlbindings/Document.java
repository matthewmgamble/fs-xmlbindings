/*
 * Copyright 2017 mgamble.
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
 * limitations under the License.
 */

/**
 *
 * @author mgamble
 */
package ca.mgamble.fs.xmlbindings;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

 
@XmlRootElement
public class Document {

    private String type = "freeswitch/xml";
    private Section section;
    
    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the section
     */
    public Section getSection() {
        return section;
    }

    /**
     * @param section the section to set
     */
    public void setSection(Section section) {
        this.section = section;
    }
}
