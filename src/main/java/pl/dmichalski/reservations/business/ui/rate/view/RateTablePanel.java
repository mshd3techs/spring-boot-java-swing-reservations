package pl.dmichalski.reservations.business.ui.rate.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.dmichalski.reservations.business.ui.rate.model.RateTableModel;

import javax.swing.*;
import java.awt.*;

@Component
public class RateTablePanel extends JPanel {

    private RateTableModel tableModel;

    private JTable table;

    @Autowired
    RateTablePanel(RateTableModel tableModel) {
        this.tableModel = tableModel;
        setPanelUp();
        initComponents();
    }

    private void setPanelUp() {
        setLayout(new BorderLayout());
    }

    private void initComponents() {
        table = new JTable(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane paneWithTable = new JScrollPane(table);
        add(paneWithTable, BorderLayout.CENTER);
    }

    public JTable getTable() {
        return table;
    }

}