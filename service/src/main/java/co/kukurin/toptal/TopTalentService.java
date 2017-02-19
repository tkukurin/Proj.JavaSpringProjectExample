package co.kukurin.toptal;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class TopTalentService {

    private final TopTalentRepository topTalentRepository;
    private final TopTalentEntityConverter topTalentConverter;

    public List<TopTalentData> getTopTalent() {
        return topTalentRepository.findAll()
                .stream()
                .map(topTalentConverter::toResponse)
                .collect(Collectors.toList());
    }

    public void addTopTalent(TopTalentData topTalentData) {
        final TopTalentEntity newTopTalentEntity = topTalentConverter.toEntity(topTalentData);
        topTalentRepository.save(newTopTalentEntity);
    }

}
