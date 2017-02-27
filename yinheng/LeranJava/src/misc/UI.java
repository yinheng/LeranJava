package misc;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created @2017/2/27 17:12
 */
public class UI extends Frame {

    private TextField mTf = new TextField();

    private TextArea mTa = new TextArea();

    public void launch() {
        setLocation(400, 300);
        setSize(300, 300);
        add(mTf, BorderLayout.SOUTH);
        add(mTa, BorderLayout.NORTH);

        beforePacking();

        this.pack();

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent arg0) {
                onClosing();
            }
        });

        mTf.addActionListener(action -> onEnter());
        setVisible(true);
    }

    public void beforePacking() {

    }

    public String getEditText() {
        return mTf.getText();
    }

    public StringBuffer getDisplayText() {
        return new StringBuffer(mTa.getText());
    }

    public void setDisplayText(String text) {
        mTa.setText(text);
    }

    public void clearDisplay() {
        mTa.setText("");
    }

    public void clearEdit() {
        mTf.setText("");
    }

    public void onClosing() {

    }

    public void onEnter() {

    }
}
