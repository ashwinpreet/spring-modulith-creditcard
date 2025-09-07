package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.core.ApplicationModule;
import org.springframework.modulith.core.ModuleDependency;
import org.springframework.modulith.core.Modules;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ModuleDependencyTest {

    @Autowired
    private ApplicationModules modules;

    @Test
    void allModulesShouldBePresent() {
        Set<String> expected = Set.of("application", "decision", "notification");
        Set<String> actual = modules.stream().map(ApplicationModule::getName).collect(Collectors.toSet());
        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void applicationModuleShouldDependOnDecision() {
        ApplicationModule application = modules.getModule("application").orElseThrow();
        List<ModuleDependency> dependencies = modules.getDependencies(application);
        Set<String> dependencyNames = dependencies.stream().map(ModuleDependency::getTarget).map(ApplicationModule::getName).collect(Collectors.toSet());
        assertThat(dependencyNames).contains("decision");
    }

    @Test
    void decisionModuleShouldDependOnNotification() {
        ApplicationModule decision = modules.getModule("decision").orElseThrow();
        List<ModuleDependency> dependencies = modules.getDependencies(decision);
        Set<String> dependencyNames = dependencies.stream().map(ModuleDependency::getTarget).map(ApplicationModule::getName).collect(Collectors.toSet());
        assertThat(dependencyNames).contains("notification");
    }

    @Test
    void notificationModuleShouldHaveNoDependencies() {
        ApplicationModule notification = modules.getModule("notification").orElseThrow();
        List<ModuleDependency> dependencies = modules.getDependencies(notification);
        assertThat(dependencies).isEmpty();
    }
}
