package hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "model")
public class Model {
        private String p1;

        public String getP1() {
                return p1;
        }

        public void setP1(String p1) {
                this.p1 = p1;
        }

        @Override
        public String toString() {
                return "Model{" +
                        "p1='" + p1 + '\'' +
                        '}';
        }
}
