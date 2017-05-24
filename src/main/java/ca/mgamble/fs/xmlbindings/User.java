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
 
public class User {
    private String id;
    private int cacheable;
    private String mailbox;
    private List<Param> params;
    private List<Variable> variables;
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    @XmlAttribute
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the cacheable
     */
    public int getCacheable() {
        return cacheable;
    }

    /**
     * @param cacheable the cacheable to set
     */
    @XmlAttribute
    public void setCacheable(int cacheable) {
        this.cacheable = cacheable;
    }

    /**
     * @return the mailbox
     */
    public String getMailbox() {
        return mailbox;
    }

    /**
     * @param mailbox the mailbox to set
     */
    @XmlAttribute
    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }
    
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
     * @param params the params to set
     */
    public void setParams(List<Param> params) {
        this.params = params;
    }
    
    @XmlElementWrapper
    @XmlElement(name="variable")
    public List<Variable> getVariable() {
        return variables;
    }
    
    public void addVariable(Variable variable) {
        if (this.variables == null) {
            this.setVariables(new ArrayList<>());
        }
        this.variables.add(variable);
    }

    /**
     * @param params the params to set
     */
    public void setVariables(List<Variable> params) {
        this.variables = params;
    }

}
