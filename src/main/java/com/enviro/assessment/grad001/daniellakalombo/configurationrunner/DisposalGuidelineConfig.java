package com.enviro.assessment.grad001.daniellakalombo.configurationrunner;

import com.enviro.assessment.grad001.daniellakalombo.model.DisposalGuidelineModel;
import com.enviro.assessment.grad001.daniellakalombo.repository.DisposalGuidelineRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class DisposalGuidelineConfig {

    @Bean
    CommandLineRunner commandLineRunner(DisposalGuidelineRepo repository){
        return args -> {
            DisposalGuidelineModel guidelineModel1 = new DisposalGuidelineModel(
                    "Plastic",
                    "Separate plastic waste into recyclable and non-recyclable."
            );

            DisposalGuidelineModel guidelineModel2 = new DisposalGuidelineModel(
                    "Glass",
                    "Dispose of glass in the designated glass bins."
            );

            repository.saveAll(
                    List.of(guidelineModel1, guidelineModel2)
            );
        };
    }
}