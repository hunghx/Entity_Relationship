package ra.session5_spring_jpa.dto.requestDto;

import java.util.List;


public class BookRequestDto {
    private String name;
    private List<Long> authorIds;
    private Long categoryId;
}
