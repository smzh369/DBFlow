package com.dbflow5.processor.utils

import com.dbflow5.processor.ProcessorManager

/**
 * Used to check if class exists on class path, if so, we add the annotation to generated class files.
 */
fun hasJavaX() = ProcessorManager.manager.elements.getTypeElement("javax.annotation.Generated") != null