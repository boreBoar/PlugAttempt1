package com.github.boreboar.plugattempt1.services

import com.github.boreboar.plugattempt1.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
