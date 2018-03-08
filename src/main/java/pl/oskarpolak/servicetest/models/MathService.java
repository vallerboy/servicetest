package pl.oskarpolak.servicetest.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class MathService {
    @Setter @Getter
    private String text;

    public int add(int a, int b){
        return  a + b;
    }

}
