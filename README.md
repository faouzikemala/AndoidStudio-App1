# AndoidStudio-App1

An App that switch to other interface with the help of intent and a link to with Uri



## Intent Explicite

Activite 1
```
Button btn =
(Button)findViewById(R.id.button); 
btn.setOnClickListener(
new View.OnClickListener() {
public void onClick(View btn) {
Intent i = new
Intent(PrincipalActivity.this,
DestinationActivity.class);
i.putExtra("n", nom.getText().toString());
i.putExtra("p",
prenom.getText().toString());
startActivity(i);
} });

```


Activite 2
```
protected void onCreate(Bundle
savedInstanceState) {
super.onCreate( savedInstanceState);
setContentView(R.layout.activity_destination);
TextView res = (TextView)
findViewById(R.id.res);
String r =
getIntent().getStringExtra("n")+" "
+getIntent().getStringExtra("p");
res.setText("Bonjour " + r);
```

## Intent Explicite
```
Button btn = (Button)findViewById(R.id.button);
btn.setOnClickListener(
new View.OnClickListener() {
public void onClick(View btn) {
String url = "http://www.google.com";
Uri uri = Uri.parse(url);
Intent sendIntent = new Intent(Intent.ACTION_VIEW, uri);
if(sendIntent.resolveActivity(getPackageManager())!=null){
startActivity(sendIntent);
}
else
Toast.makeText(getApplicationContext(), "Erreur",
Toast.LENGTH_SHORT).show();
} });}

```
