package lista.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lista.model.Jogador;

@Controller
public class JogadorController {

	@GetMapping("/")
	public String jogador(Model model) {
		
		List<Jogador> jogadores = new ArrayList<>();

		jogadores.add(new Jogador("Neymar Jr.", "https://cdn.espn.com.br/image/wide/622_5a9eb25c-b7bf-4189-a1aa-58c27606a454.jpg", "https://logodetimes.com/times/selecao-brasileira-brasil-novo-logo-2019-com-estrelas/logo-selecao-brasileira-brasil-novo-logo-2019-com-estrelas-2048.png", 10));
		jogadores.add(new Jogador("Cristiano Ronaldo", "https://cdn-3.expansion.mx/dims4/default/2df23b4/2147483647/strip/true/crop/3000x2000+0+0/resize/1200x800!/format/webp/quality/60/?url=https%3A%2F%2Fcdn-3.expansion.mx%2F52%2F7c%2F0cc1189c4447badc9773e67e1fce%2Fgettyimages-1475641629.jpg", "https://images.vexels.com/media/users/3/152592/isolated/preview/96d97eadc822aafbc7062c6646da0c47-logo-da-sele-o-portuguesa-de-futebol.png", 7));
		jogadores.add(new Jogador("Kylian Mbappé", "https://images.bild.de/64b0653a4bf28e45265f6281/0739eca8be73614950a8b95159f6498d,866669b9?w=992", "https://i.pinimg.com/originals/94/ad/28/94ad289c8ace7a595b24658e01b2d8d2.png", 10));
		
		model.addAttribute("jogadores", jogadores);
		
		return "jogadores";
	}
}
