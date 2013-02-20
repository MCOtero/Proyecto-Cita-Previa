/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packHola.saludo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 *
 * @author Max
 */
public class saludar extends Activity {
    /**
     * Called when the activity is first created.
     */
   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        TextView textView = (TextView) findViewById(R.id.mostrar_nombre);

        Intent intent = getIntent();
        String message = intent.getStringExtra("nombreASaludar");
        
        //text view
        textView.setText("Un cordial saludo a "+ message);
    }
   
    public void vuelve(View view)
    {
        startActivity(new Intent(this,MainActivity.class));
    }
}
