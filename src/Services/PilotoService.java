package Services;

import DAO.PessoaDAO;
import Models.Piloto;

import java.io.IOException;
import java.io.PrintWriter;

public class PilotoService {

    private final PessoaDAO pessoadao = PessoaDAO.getInstance();

    protected String[] request;
    protected PrintWriter output;
    String outputMessage;

    public PilotoService(String[] request, PrintWriter output) throws IOException {
        this.request = request;
        this.output = output;
    }


    public void add(){

        try {
            Piloto piloto = new Piloto(request[2], request[3],request[4],request[5]);
            System.out.println(piloto);
            pessoadao.addPiloto(piloto);

            outputMessage = "Piloto cadastrado com sucesso";

        }catch (Exception e){
            outputMessage = "Ocorreu um erro ao tentar cadastrar o piloto, segue o erro:" + e.getMessage();
        }

        output.println(outputMessage);
    }
    public void update(){

        try {
            outputMessage = pessoadao.atualizaPiloto(request[2], request[3], request[4],request[5]);
          
         }catch (Exception e){
             outputMessage = e.getMessage();
         }
 
         output.println(outputMessage);
 

    }
    public void get(){
        try {
           Piloto piloto = pessoadao.getPiloto(request[2]);
           outputMessage = piloto.toString();
        }catch (Exception e){
            outputMessage = e.getMessage();
        }

        output.println(outputMessage);
    }
    public void delete(){
        try {
            outputMessage = pessoadao.removePiloto(request[2]);
        }catch (Exception e){
            outputMessage = e.getMessage();
        }

        output.println(outputMessage);
    }
    public void list(){
        try {
            outputMessage = pessoadao.listPilotos();
            System.out.println(outputMessage);
        }catch (Exception e){
            outputMessage = e.getMessage();
        }

        output.println(outputMessage);
    }
}
