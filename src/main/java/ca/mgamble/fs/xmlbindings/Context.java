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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;



 

public class Context {
    private String name;
    private String description;
    private List<Extension> mExtensions;
    private Domain domain;
    
    public Context() {
        
    }
    public Context(String name) {
        this.name = name;
    }
    public Context(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    
    @XmlElement(name="extension")
    public List<Extension> getExtension() {
        return mExtensions;
    }
    
    public void addExtension(Extension extension) {
        if (this.mExtensions == null) {
            this.setExtension(new ArrayList<>());
        }
        this.mExtensions.add(extension);
    }

        /**
     * @param extension the extension to set
     */
    
    public void setExtension(List<Extension> extension) {
        this.mExtensions = extension;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    @XmlAttribute
    public void setDescription(String description) {
        this.description = description;
    }



    /**
     * @return the domain
     */
    public Domain getDomain() {
        return domain;
    }

    /**
     * @param domain the domain to set
     */
    @XmlElement
    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    
}
