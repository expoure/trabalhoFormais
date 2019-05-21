/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gramatica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author dkram
 */
public class NewJFrame extends javax.swing.JFrame {
/*
guardando aqui exemplos pra testar
    
S -> a|aB|b
A -> aS|aB
B -> b|bA       

A -> A|aB
B -> b|bB
*/
    
    
    private ArrayList ladoEsquerdoProducao = new ArrayList<>();
    private ArrayList ladoDireitoProducao = new ArrayList<>();    
    private ArrayList<Produtor> listaProdutores = new ArrayList<>();
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nterminais = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Executar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        aDef = new javax.swing.JLabel();
        terminais = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        producao = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Nterminais.setText("A,B");
        Nterminais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NterminaisActionPerformed(evt);
            }
        });

        jLabel1.setText("Entre com a gramática abaixo:");

        jLabel3.setText("Não terminais:");

        jLabel4.setText("Terminais:");

        jLabel5.setText("Produção:");

        Executar.setText("Executar");
        Executar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecutarActionPerformed(evt);
            }
        });

        jLabel2.setText("Gramática a ser definida:");

        aDef.setText("A definir...");

        terminais.setText("a,b");

        producao.setColumns(20);
        producao.setRows(5);
        producao.setText("A -> a|aB\nB -> b|bB");
        jScrollPane1.setViewportView(producao);

        jLabel6.setText("obs: Sentença vazia: *");

        jLabel7.setText("Derivação:");

        jLabel8.setText("...");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aDef))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(59, 59, 59))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nterminais, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(terminais, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(Executar))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Nterminais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(terminais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Executar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(aDef))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NterminaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NterminaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NterminaisActionPerformed

    private void ExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecutarActionPerformed
        jTextArea1.setText("");
        String gramatica = "G = ({"+ pegarNterminais() + "}, {" + pegarTerminais() + "}, P, S)";
        aDef.setText(gramatica);
        jTextArea1.append("Questão 2: visualização da gramática formatada: \n" + gramatica + "\n\n");
        
        String producaoSep[]=producao.getText().split("\n");
        
        int posicaoSeparador=0;
        //para acessar cada uma das linhas da producao: producaoSep[n], sendo n a linha desejada.
        for (String linha:producaoSep){
            System.out.println(linha);
            posicaoSeparador = linha.indexOf("->");
            ladoEsquerdoProducao.add(linha.substring(0, posicaoSeparador).trim());
            ladoDireitoProducao.add(linha.substring(posicaoSeparador+2, linha.length()).trim());
            

        } 
        System.out.println("ladoEsq="+ladoEsquerdoProducao);
        System.out.println("ladoDir="+ladoDireitoProducao);        
        
        populaListaDeProdutores();
        
        System.out.println("-----EXIBINDO OS PRODUTORES E SUAS GERAÇÕES-----");
                
        for (Produtor prod : listaProdutores) {
            System.out.println("Letras="+prod.getLetras());
            for (int i = 0; i < prod.getGeradores().size(); i++) {
                System.out.println("    Geradores="+prod.getGeradores().get(i));
            }
        }
        System.out.println("------------------------------------------------");

        if (validaGramatica() == false) {
            JOptionPane.showMessageDialog(null, "A Gramática é inválida.","Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }else{
            jTextArea1.append("Questão 3: Validação da gramática: OK \n\n");
            String resposta = tipoGramatica();
            //JOptionPane.showMessageDialog(null, resposta,"Tipo da Gramática", JOptionPane.INFORMATION_MESSAGE);
            jTextArea1.append("Questão 4: Tipo da gramática: " + resposta + "\n\n");
            derivaGramatica(resposta);
            geraTabelaAutomatoFinito(resposta);
        }
               
        //derivaGramatica(resposta);
        
        
    }//GEN-LAST:event_ExecutarActionPerformed

    public boolean validaGramatica(){
        String resposta  = tipoGramatica();
        
        if(resposta == ""){
            return false;
        }else{
            return true;
        }
    }
    
    public void populaListaDeProdutores(){
        for (int i = 0; i < ladoEsquerdoProducao.size(); i++) {
            //cria produtor e coloca as Letras nele (Letras = lado esquerdo)
            Produtor produtor = new Produtor();
            produtor.setLetras(ladoEsquerdoProducao.get(i).toString());
            
            //separa os geradores do lado esquerdo           
            String[] ladoDireitoSeparado = ladoDireitoProducao.get(i).toString().split("\\|");
            
            //insere na lista do produtor
            for (int j = 0; j < ladoDireitoSeparado.length; j++) {
                produtor.getGeradores().add(ladoDireitoSeparado[j]);                
            }
            
            listaProdutores.add(produtor);
        }       
    }
    
    public String derivaGramatica(String resposta){
        int nivelJaDerivado = 0; //contador para derivar certa quantidade de vezes só
        
        boolean derivar = true;
        Random r = new Random();
        Produtor produtorAtual = new Produtor();
        String geradorAtual= listaProdutores.get(0).getLetras() + " -> "; //gerador do lado direito
        String g = "";
        String terminal = "";
        String naoTerminal = "";

        produtorAtual = listaProdutores.get(0);
        //System.out.println(produtorAtual.getLetras());
        
        if(resposta.equals("Gramática regular") || resposta.equals("Gramática livre de contexto")){
            while(derivar){
            
                int x = r.nextInt(produtorAtual.getGeradores().size()); //escolhe indice aleatorio
                g = produtorAtual.getGeradores().get(x).toString(); //pega o gerador aleatorio e guarda
                System.out.println(g);

                if(terminal.isEmpty()){
                    geradorAtual = geradorAtual.concat(g + " -> ");
                }else{
                    geradorAtual = geradorAtual.concat(terminal + g + " -> ");
                }

                //se o gerador aleatorio for minusculo, a derivação termina
                //se contiver maiuscula, percorre a string e retorna a letra maiucula
                if(g.toLowerCase().equals(g)){             
                    System.out.println("derivação terminada: " + geradorAtual.toString()); //precisar concatenar os resultados
                    jLabel8.setText(geradorAtual.toString());
                    jTextArea1.append("Questão 5: Derivação: " + geradorAtual.toString());
                    derivar = false;
                }else{
                    for(int y = 0; y < g.length(); y++){
                        if(Character.isUpperCase(g.charAt(y))){
                           char w = g.charAt(y);
                           naoTerminal = Character.toString(w);
                        }
                        if(Character.isLowerCase(g.charAt(y))){
                           char w = g.charAt(y);
                           terminal = terminal.concat(Character.toString(w));
                        }
                        //System.out.println(isUp);
                        produtorAtual = listaProdutores.get(indiceNT(naoTerminal));
                    }
                }
                    
            }
        }else{
            //derivar os dois primeiros tipos
        }
        
        return "";
    }
    
    public int indiceNT(String isUp){
        int i = 0;
        for (i = 0; i < listaProdutores.size()-1; i++) {
            if(isUp.equals(listaProdutores.get(i).getLetras())){
                return i;
            }
        }
        return i;
    }
    
    public String tipoGramatica(){
        //dar um jeito de zerar esses valores a cada clique no botao executar
        int gr = 0;
        int glc = 0;
        int gsc = 0;
        int gi = 0;
        int vazio = 0;
        int comp = 0;
        
        
        for(int i = 0; i < listaProdutores.size(); i++){ 
            if (listaProdutores.get(i).getLetras().length() > 1) {
                comp = listaProdutores.get(i).getLetras().length();
                for(int j = 0; j < listaProdutores.get(i).getGeradores().size(); j++){
                    if(comp <= listaProdutores.get(i).getGeradores().get(j).toString().length() ){
                        gsc++;
                    }else{
                        gi++;
                    }
                }
                break;
            }else{
                for(int j = 0; j < listaProdutores.get(i).getGeradores().size(); j++){
                    int tam = listaProdutores.get(i).getGeradores().get(j).toString().length();
                    if (tam <= 2) { //verificar se é gramatica regular
                        if(tam == 1 && Character.isLowerCase(listaProdutores.get(i).getGeradores().get(j).toString().charAt(0))){
                            gr++;
                        }else{
                            if(Character.isLowerCase(listaProdutores.get(i).getGeradores().get(j).toString().charAt(0)) && 
                                Character.isUpperCase(listaProdutores.get(i).getGeradores().get(j).toString().charAt(1))){
                                gr++;
                            }else{//se nenhuma condição para ser gr é satisfeita, então é glc
                                if(listaProdutores.get(i).getGeradores().get(j).toString().equals("*")){
                                    vazio++;
                                }else{
                                    glc++;
                                }
                                
                            }
                        }

                    }else{ 
                            glc++;
                    }
                }
            }
        }
        

        /*--------------------
        Tornar mais coeso os identificadores de gramática abaixo        */      
        if(glc > 0 && vazio == 0 && comp == 0){
            return ("Gramática livre de contexto");
        }else{
            if(gr > 0 && comp == 0){
                return ("Gramática regular");
            }else{
                if(gi > 0){
                    return ("Gramática irrestrita");                    
                }else{
                    if(gsc > 0){
                        return ("Gramática sensível ao contexto"); 
                    }else{
                       return (""); 
                    }
                }
            }
        }
        
        //System.out.println(Math.max(gr, glc));
    }
    
    public String pegarNterminais(){
        if(Nterminais.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Informe os não terminais! Ex: S,A,B");
            return null;
        }
        return Nterminais.getText().toUpperCase();
    }

    public String pegarTerminais(){
        if(terminais.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Informe os  terminais! Ex: a,b");
            return null;
        }
        return terminais.getText().toLowerCase();
    }
    
    public void geraTabelaAutomatoFinito(String resposta){
        
        if(resposta.equals("Gramática regular")){
            System.out.println("--------------------QUESTÃO 6----------------------------");
            System.out.println("Reconhecer a entrada através de um autômato finito.");
            String vetorTerminais[] = terminais.getText().split(",");
            String vetorNaoTerminais[] = Nterminais.getText().split(",");        
            String matrizAutomato[][] = new String[vetorNaoTerminais.length+1][vetorTerminais.length+1];
            jTextArea1.append("\n\nQuestão 6: Reconhecer por autômato finito:\n");

            for (int i = 0; i < matrizAutomato.length; i++) {
                for (int j = 0; j < matrizAutomato.length; j++) {
                    matrizAutomato[i][j] = "";
                }
            }        
            //popula as linhas, coluna ZERO com os NÃO TERMINAIS
            int indiceVetores=0;
            for (int i = 1; i < matrizAutomato.length; i++) {
                matrizAutomato[i][0] = vetorNaoTerminais[indiceVetores];            
                indiceVetores++;
            }
            indiceVetores=0;
            //popula as colunas, linha ZERO com os TERMINAIS
            for (int i = 1; i < matrizAutomato.length; i++) {
                matrizAutomato[0][i] = vetorTerminais[indiceVetores];            
                indiceVetores++;
            }     

            String g="";
            String naoTerminal="", terminal="";
            int indNT=0, indT=0;

            for (Produtor prod : listaProdutores) {
                for (int i = 0; i < prod.getGeradores().size(); i++) {
                    g = prod.getGeradores().get(i).toString();
                    if(!g.toLowerCase().equals(g)){ //caso não for terminal, percorre o NÃO TERMINAL e separa os caracteres terminais dos não terminais
                        terminal="";
                        naoTerminal="";
                        for(int y = 0; y < g.length(); y++){
                            if(Character.isUpperCase(g.charAt(y))){
                               char w = g.charAt(y);
                               naoTerminal = Character.toString(w);
                            }
                            if(Character.isLowerCase(g.charAt(y))){
                               char w = g.charAt(y);
                               terminal = terminal.concat(Character.toString(w)); // e para no caso de ter mais de 1 terminal separar:   a|b|c ????
                            }
                        }

                        //String terminais[] = terminal.split("|"); //possibilidade de ser a|b|c      em:    A-> a|abcB
                        //for (int j = 0; j < terminais.length; j++) {
                            //inserindo na tabela
                            indNT = indiceNT_NaMatriz(prod.getLetras(), matrizAutomato);
                            indT  = indiceTerminal_NaMatriz(terminal, matrizAutomato);                        
                            matrizAutomato[indNT][indT] = naoTerminal;
                        //}                    
                    }
                }
            }
            jTextArea1.append("\nTabela gerada:\n");
            System.out.println("TABELA GERADA");

            for (int i = 0; i < matrizAutomato.length; i++) {            
                for (int j = 0; j < matrizAutomato.length; j++) {
                    if (j==0){
                        if (matrizAutomato[i][j].equals("")){
                            System.out.print("| - |");
                            jTextArea1.append("| - |");
                        }else{
                            System.out.print("| "+matrizAutomato[i][j]+" |"); 
                            jTextArea1.append("| "+matrizAutomato[i][j]+" |");
                        }                    
                    }else{
                        if (matrizAutomato[i][j].equals("")){
                            System.out.print(" - |");
                            jTextArea1.append(" - |");
                        }else{
                            System.out.print(" "+matrizAutomato[i][j]+" |"); 
                            jTextArea1.append(" "+matrizAutomato[i][j]+" |");
                        }                    
                    }
                }
                jTextArea1.append("\n");
                System.out.println("");                                            
            }        
            System.out.println("------------------------------------------------");
            }else{
                jTextArea1.append("\n\nQuestão 6: Reconhecer por autômato finito:\n");
                jTextArea1.append("\n\nQuestão 6: Gramática não é regular (tipo 3)");
        }
    }
    
    public int indiceNT_NaMatriz(String texto, String matrizAutomato[][]){
        int indicePadrao = 0;
        //procura nas linhas da primeira coluna
        for (int i = 0; i < matrizAutomato.length; i++) {
            if (matrizAutomato[i][0].equals(texto)){
                return i;                
            }
        }
        return indicePadrao;
    }
    
    public int indiceTerminal_NaMatriz(String texto, String matrizAutomato[][]){
        int indicePadrao = 0;
        //procura nas colunas da primeira linha
        for (int i = 0; i < matrizAutomato.length; i++) {
            if (matrizAutomato[0][i].equals(texto)){
                return i;                
            }
        }
        return indicePadrao;
    }    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Executar;
    private javax.swing.JTextField Nterminais;
    private javax.swing.JLabel aDef;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea producao;
    private javax.swing.JTextField terminais;
    // End of variables declaration//GEN-END:variables


}
