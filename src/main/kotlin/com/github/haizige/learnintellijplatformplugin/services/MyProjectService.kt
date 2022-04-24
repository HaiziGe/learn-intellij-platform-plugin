package com.github.haizige.learnintellijplatformplugin.services

import com.intellij.openapi.project.Project
import com.github.haizige.learnintellijplatformplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
