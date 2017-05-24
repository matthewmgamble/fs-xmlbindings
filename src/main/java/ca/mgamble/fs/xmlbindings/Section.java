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

public class Section {
    private String name;
    private String description;
    private List<Param> params;
    private Domain domain;
    private Context context;
    
    @XmlElementWrapper
    @XmlElement(name="param")
    public List<Param> getParams() {
        return params;
    }
    
    public void addParam(Param param) {
        if (this.params == null) {
            this.setParams(new ArrayList<>());
        }
        this.params.add(param);
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
     * @param params the params to set
     */
    public void setParams(List<Param> params) {
        this.params = params;
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

    /**
     * @return the context
     */
    @XmlElement
    public Context getContext() {
        return context;
    }

    /**
     * @param context the section to set
     */
    public void setContext(Context context) {
        this.context = context;
    }

    
}
