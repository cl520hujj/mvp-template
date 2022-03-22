package com.github.cl520hujj.mvptemplate.services

import com.intellij.openapi.project.Project
import com.github.cl520hujj.mvptemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
