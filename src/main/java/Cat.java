import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Objects;

public class Cat {
    private String voice;

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
