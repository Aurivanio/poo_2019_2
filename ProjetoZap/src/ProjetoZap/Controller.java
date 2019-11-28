package ProjetoZap;

import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        Whatsapp whatsapp = new Whatsapp();
        Scanner capInfor = new Scanner(System.in);
        String capInforVet[];
        Usuario usuario;
        OUTER:
        while (true) {
            try {
                capInforVet = ((capInfor.nextLine()).split(" "));
                switch (capInforVet[0]) {
                    case "adcUsuario":
                        whatsapp.usuarios.add(capInforVet[1], new Usuario(capInforVet[1]));
                        break;
                    case "todosUsuarios":
                        whatsapp.mostrarUsuarios();
                        break;
                    case "novoGrupo":
                        whatsapp.grupos.add(capInforVet[2], new Grupo(capInforVet[2], whatsapp.usuarios.get(capInforVet[1])));
                        break;
                    case "fazerConvite":
                        whatsapp.fazerConvite(capInforVet[1], capInforVet[2], capInforVet[3]);
                        break;
                    case "mostrarGrupos":
                        System.out.println((whatsapp.usuarios.get(capInforVet[1])).mostrarGrupos());
                        break;
                    case "usuariosDoGrupo":
                        System.out.println((whatsapp.grupos.get(capInforVet[1])).mostrarUsuarios());
                        break;
                    case "tirar":
                        whatsapp.usuarios.get(capInforVet[1]).sair(capInforVet[2]);
                        break;
                    case "enviarMensagem":
                        for (int i = 4; i < capInforVet.length; i++) {
                            capInforVet[3] += " " + capInforVet[i];
                        }
                        whatsapp.usuarios.get(capInforVet[1]).enviarMensagem(capInforVet[2], capInforVet[3]);
                        break;
                    case "lerMensagens":
                        whatsapp.usuarios.get(capInforVet[1]).lerMensagens(capInforVet[2]);
                        break;
                    case "verNotificacoes":
                        whatsapp.usuarios.get(capInforVet[1]).mostrarNotificacoes();
                        break;
                    case "fim":
                        break OUTER;
                    default:
                        System.out.println("Comando invalido.");
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
