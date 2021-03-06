package com.jakutenshi.projects.umlplugin.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.jakutenshi.projects.umlplugin.ui.UMLDiagramPanel;
import com.jakutenshi.projects.umlplugin.ui.UMLToolWindowContentPanel;

/**
 * Created by JAkutenshi on 25.05.2016.
 */
public class ZoomInAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        UMLDiagramPanel panel = UMLToolWindowContentPanel.getDrawingPanel();
        if (panel != null) {
            panel.zoomIn();
        }
    }
}
