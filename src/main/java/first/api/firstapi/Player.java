package first.api.firstapi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private Integer id;
    private String name;
    private String country;
    private double avg;
    private int wickets;
    private int runs; 
}
