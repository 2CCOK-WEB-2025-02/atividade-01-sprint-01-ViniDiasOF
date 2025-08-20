package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse calcularFibonacci(@PathVariable int n) {
        if (n <= 0) {
            return new ExercicioDificilResponse(0, 0);
        }

        int termoAnterior = 0;
        int termoAtual = 1;
        int soma = 1;

        for (int i = 2; i <= n; i++) {
            int proximo = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = proximo;
            soma += termoAtual;
        }

        return new ExercicioDificilResponse(termoAtual, soma);
    }
}
