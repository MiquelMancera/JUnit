package calculator;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Calculadora {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Button btn7 = new Button(shell, SWT.NONE);
		btn7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btn7.setBounds(10, 18, 45, 45);
		btn7.setText("7");
		
		Button btn4 = new Button(shell, SWT.NONE);
		btn4.setText("4");
		btn4.setBounds(10, 69, 45, 45);
		
		Button btn8 = new Button(shell, SWT.NONE);
		btn8.setText("8");
		btn8.setBounds(61, 18, 45, 45);
		
		Button btn5 = new Button(shell, SWT.NONE);
		btn5.setText("5");
		btn5.setBounds(61, 69, 45, 45);
		
		Button btn1 = new Button(shell, SWT.NONE);
		btn1.setText("1");
		btn1.setBounds(10, 120, 45, 45);
		
		Button btn2 = new Button(shell, SWT.NONE);
		btn2.setText("2");
		btn2.setBounds(61, 120, 45, 45);
		
		Button btn9 = new Button(shell, SWT.NONE);
		btn9.setText("9");
		btn9.setBounds(112, 18, 45, 45);
		
		Button btn6 = new Button(shell, SWT.NONE);
		btn6.setText("6");
		btn6.setBounds(112, 69, 45, 45);
		
		Button btn3 = new Button(shell, SWT.NONE);
		btn3.setText("3");
		btn3.setBounds(112, 120, 45, 45);
		
		Button btn0 = new Button(shell, SWT.NONE);
		btn0.setText("0");
		btn0.setBounds(10, 171, 45, 45);
		
		Button btnigual = new Button(shell, SWT.NONE);
		btnigual.setText("=");
		btnigual.setBounds(61, 171, 96, 45);
		
		Button btndivi = new Button(shell, SWT.NONE);
		btndivi.setText("/");
		btndivi.setBounds(175, 120, 45, 45);
		
		Button btnmes = new Button(shell, SWT.NONE);
		btnmes.setText("+");
		btnmes.setBounds(175, 69, 45, 45);
		
		Button btnmenys = new Button(shell, SWT.NONE);
		btnmenys.setText("-");
		btnmenys.setBounds(175, 18, 45, 45);
		
		Button btnmulti = new Button(shell, SWT.NONE);
		btnmulti.setText("x");
		btnmulti.setBounds(175, 171, 45, 45);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
