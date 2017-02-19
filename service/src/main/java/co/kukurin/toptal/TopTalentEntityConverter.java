package co.kukurin.toptal;

import org.springframework.stereotype.Component;

@Component
public class TopTalentEntityConverter {

    public TopTalentData toResponse(TopTalentEntity topTalentEntity) {
        return new TopTalentData(topTalentEntity.getName());
    }

    public TopTalentEntity toEntity(TopTalentData topTalentData) {
        return new TopTalentEntity(topTalentData.getName());
    }
}
