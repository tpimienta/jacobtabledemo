import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.util.List;
import java.util.Arrays;

public class Foo {

    private JFrame frame;
    
    public Foo() {
        frame = new JFrame("Foo");
        List<String> words = Arrays.asList("Hello", "world");
        JTable table = new JTable(new MyTableModel(words));
        //table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        //table.setFillsViewportHeight(true);
        //table.setFillsViewportHeight(true);
        JPanel gui = new JPanel(new FlowLayout());
        JScrollPane scrollPane = new JScrollPane(table);
        //table.setFillsViewportHeight(true);
        gui.add(scrollPane);
        frame.setContentPane(gui);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Foo();
    }
    
    class MyTableModel extends AbstractTableModel {
        private List<String> words;        
        private String[] columnNames = new String[]{"Words"};
        
        public MyTableModel(List<String> words) {
            this.words = words;
        }       
    
        public int getColumnCount() {
            return columnNames.length;
        }
    
        public int getRowCount() {
            return this.words.size();
        }
    
        public String getColumnName(int col) {
            return columnNames[col];
        }
    
        public Object getValueAt(int row, int col) {
            
                return this.words.get(row);
            
        }
    }
}