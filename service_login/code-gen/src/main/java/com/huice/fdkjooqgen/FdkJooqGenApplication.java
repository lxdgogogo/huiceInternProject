package com.huice.fdkjooqgen;

import org.jooq.codegen.JavaGenerator;
import org.jooq.codegen.JavaWriter;
import org.jooq.meta.SchemaDefinition;

public class FdkJooqGenApplication extends JavaGenerator {

    @Override
    protected void printClassJavadoc(JavaWriter out, String comment) {
        out.println("import lombok.Builder;");
        super.printClassJavadoc(out, comment);
    }

    @Override
    protected void printClassAnnotations(JavaWriter out, SchemaDefinition schema) {
        super.printClassAnnotations(out, schema);
        out.println("@Builder");
    }
}

