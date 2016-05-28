package com.jakutenshi.projects.umlplugin.container.entities.attributes;

import com.jakutenshi.projects.umlplugin.container.UMLElement;
import com.jakutenshi.projects.umlplugin.container.entities.Generatable;

/**
 * Created by JAkutenshi on 28.05.2016.
 */
public class EnumField extends UMLElement implements Generatable{
    private String name;

    @Override
    public String toUML() {
        return name;
    }

    @Override
    public String toCode() {
        return name;
    }

    public EnumField(String name) {
        this.name = name;
    }

    public EnumField() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
