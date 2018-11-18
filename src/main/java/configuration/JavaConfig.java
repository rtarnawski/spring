package configuration;

import model.imp.DragonSlayerQuest;
import model.imp.Knight;
import model.imp.SaveQueenQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean (name = "knight")
    public Knight generateKnight(){
       Knight knight = new Knight();
       knight.setName("Artur");
      // knight.setQuest(generateDragonSlayerQuest());
       return knight;
    }

@Bean(name = "dragon")
    public DragonSlayerQuest generateDragonSlayerQuest(){
        return new DragonSlayerQuest();
}

@Bean(name = "queen")
    public SaveQueenQuest generateSaveQueenQuest(){
        return  new SaveQueenQuest();
}

}
