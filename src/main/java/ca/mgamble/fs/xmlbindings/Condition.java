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
 
public class Condition {
    private String field;
    private String expression;
    
    private List<Action> mActions;
   
    public Condition() {     
    }
    public Condition(String field) {
        this.field = field;
    }
    public Condition(String field, String expression) {
        this.field = field;
        this.expression = expression;
    }

    /**
     * @return the field
     */
    public String getField() {
        return field;
    }

    /**
     * @param field the field to set
     */
    @XmlAttribute
    public void setField(String field) {
        this.field = field;
    }

    /**
     * @return the expression
     */
    public String getExpression() {
        return expression;
    }

    /**
     * @param expression the expression to set
     */
    @XmlAttribute
    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void addAction(Action action) {
        if (this.mActions == null) {
            this.mActions = new ArrayList<>();
        }
        this.mActions.add(action);
    }
    /**
     * @return the actions
     */
    @XmlElement(name="action")
    public List<Action> getActions() {
        return mActions;
    }

    /**
     * @param actions the actions to set
     */
    public void setActions(List<Action> actions) {
        this.mActions = actions;
    }
    
}
