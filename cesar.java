import java.util.Scanner;

public class Cifracesar {

    public static String encriptar(int chave, String texto) {
        StringBuilder textoCifrado = new StringBuilder();
        int tamanhoTexto = texto.length();
    
        for (int c = 0; c < tamanhoTexto; c++) {
            int letraCifradaASCII = ((int) texto.charAt(c)) + (chave - 1);
    
            while (letraCifradaASCII > 126) {
                letraCifradaASCII -= 94;
            }
    
            textoCifrado.append((char) letraCifradaASCII);
        }
    
        return textoCifrado.toString();
    }
    
    public static String decriptar(int chave, String textoCifrado) {
        StringBuilder texto = new StringBuilder();
        int tamanhoTexto = textoCifrado.length();
    
        for (int c = 0; c < tamanhoTexto; c++) {
            int letraDecifradaASCII = ((int) textoCifrado.charAt(c)) - (chave - 1);
    
            while (letraDecifradaASCII < 32) {
                letraDecifradaASCII += 94;
            }
    
            texto.append((char) letraDecifradaASCII);
        }
    
        return texto.toString();
    }
    
    public static void main(String[] args){
        int what_do = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para criptografar e 2 para decriptografar"));

        if (what_do == 1){
            String messageOriginal = JOptionPane.showInputDialog("Digite a mensagem: ");
            int key = Integer.parseInt(JOptionPane.showInputDialog( "Digite a chave: "));
            
            String textCript = encriptar(key, messageOriginal);
            JOptionPane.showMessageDialog(null," Mensagem criptografada: '"+textCript+"'.\nA mensagem criptografada já está na sua àrea de transferencia, basta colar onde quer enviar.\nNão se esqueça da chave!","Criptografia de Cesar",JOptionPane.INFORMATION_MESSAGE);
            StringSelection stringSelection = new StringSelection(textCript);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
        if (what_do == 2){
            String textCifr = JOptionPane.showInputDialog("Digite a mensagem: ");
            int key = Integer.parseInt(JOptionPane.showInputDialog( "Digite a chave: "));
            String textCript =decriptar(key, textCifr);
            JOptionPane.showMessageDialog(null," Mensagem criptografada: '"+textCript+"'.\nA mensagem criptografada já está na sua àrea de transferencia, basta colar onde quer enviar.\nNão se esqueça da chave!","Criptografia de Cesar",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null," Mensagem "+textCript,"Criptografia de Cesar",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null," Não entendi, tente novamente!","Criptografia de Cesar",JOptionPane.INFORMATION_MESSAGE);
        }		

    }
}