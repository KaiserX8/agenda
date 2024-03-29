package br.senac.rn.agenda;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.repository.ContatoRepository;

import java.util.List;

public class TestaPrograma {

    public static void main(String[] args) {

        ContatoRepository bandoDeDados = new ContatoRepository();

        Contato jota = new Contato("Jota Lopes", "9999-8888");

        bandoDeDados.salva(jota);

        Contato filipe = new Contato("Filipe Pontes", "8888-6666");

        Contato michele = new Contato("Michele Silva" ,"3232-1423");

        bandoDeDados.salva(michele);

        bandoDeDados.salva(filipe);

//        exemplo - 1
//        for (int i = 0; i < bandoDeDados.buscaTodos().size(); i++) {
//            Contato contato = bandoDeDados.buscaTodos().get(i);
//            System.out.println(contato.getNome());
//        }
        List<Contato> contatos = bandoDeDados.buscaTodos();

        for (Contato contato : bandoDeDados.buscaTodos()) {
            System.out.println(contato.getNome());
        }
//        exemplo - 2
//        System.out.println(bandoDeDados.buscaTodos());

    }

}
