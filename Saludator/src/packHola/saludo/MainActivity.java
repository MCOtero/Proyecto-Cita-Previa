package packHola.saludo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity
{   
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    /*al pulsar el botón de enviar nombre*/
    public void enviaNombre(View view)
    {
        Intent in = new Intent(this,saludar.class);
        EditText editText = (EditText) findViewById(R.id.edit_nombre);
        String mensaje = editText.getText().toString();
        in.putExtra("nombreASaludar", mensaje);
        startActivity(in);
    }
}
