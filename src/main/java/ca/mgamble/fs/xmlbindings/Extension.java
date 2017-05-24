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

 
public class Extension {

   
   private List<Condition> mConditions;
    
    private String name;
    private boolean continueProcessing = false;
    
    public Extension() {
        
    }
    public Extension(String name) {
        this.name = name;
    } 
    public Extension(String name, boolean cont) {
        this.name = name;
        this.continueProcessing = cont;
    }
    public void addCondition(Condition condition) {
        if (this.mConditions == null) {
            this.mConditions = new ArrayList<>();
        } 
        this.mConditions.add(condition);
    }
    /**
     * @return the conditions
     */
    @XmlElement(name="condition")
    public List<Condition> getConditions() {
        return mConditions;
    }

    /**
     * @param conditions the conditions to set
     */
    public void setConditions(List<Condition> conditions) {
        this.mConditions = conditions;
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
     * @return the continueProcessing
     */
    public boolean isContinueProcessing() {
        return continueProcessing;
    }

    /**
     * @param continueProcessing the continueProcessing to set
     */
    @XmlAttribute(name="continue")
    public void setContinueProcessing(boolean continueProcessing) {
        this.continueProcessing = continueProcessing;
    }

}
