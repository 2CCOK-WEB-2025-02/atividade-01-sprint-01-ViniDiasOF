package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

        @RestController
        public class ExercicioFacilController {

            @GetMapping("/ex-01/{palavra}")
            public Boolean exercicioFacil(@PathVariable String palavra) {
                String normalizada = palavra.toLowerCase();

                int i = 0;
                int j = normalizada.length() - 1;

                while (i < j) {
                    if (normalizada.charAt(i) != normalizada.charAt(j)) {
                        return false;
                    }
                    i++;
                    j--;
                }

                return true;
            }
        }
