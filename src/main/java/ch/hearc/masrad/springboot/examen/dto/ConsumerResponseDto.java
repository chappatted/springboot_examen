package ch.hearc.masrad.springboot.examen.dto;

import ch.hearc.masrad.springboot.examen.entity.Consumer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ConsumerResponseDto {

    private Long id;
    private String name;
    private String email;
    private Integer reviewCount;
    private List<ReviewResponseDto> reviews;

    public static ConsumerResponseDto fromEntity(Consumer consumer) {
        return new ConsumerResponseDto(consumer.getId(), consumer.getName(), consumer.getEmail(),
                consumer.getReviews().size(), consumer.getReviews().stream().map(ReviewResponseDto::fromEntity).toList());
    }

}
