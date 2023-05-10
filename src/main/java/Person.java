import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
//@Getter
//@Setter
//@ToString(callSuper = true)
@NoArgsConstructor
//@EqualsAndHashCode
@Data
@SuperBuilder(toBuilder = true)
public class Person {

    private String name;
    private int age;
    private double height;
    @Getter(AccessLevel.NONE)
    @Builder.Default//jak przypisane to by nie wział tego
    private Long pesel = 123L;

}
