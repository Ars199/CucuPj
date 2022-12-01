package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**!!внимание, название класса должно иметь окончание Test, иначе тесты не будут запускаться
 * features – путь к папке с .feature файлами. Фреймворк будет искать файлы в этой и во всех дочерних папках. Можно указать несколько папок, например: features = {«src/test/features», «src/test/feat»};
 * **/

@RunWith(Cucumber.class)
@CucumberOptions(
        /*features = "src/test/features",
        glue = "ru.savkk.test",
        tags = "@all",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE
//        name = "^Успешное|Успешная.*"*/

                features = "src/test/features",
                glue = "org.example",
                tags = "@withdrawal",
                snippets = SnippetType.CAMELCASE

)
public class RunnerTest {
}
