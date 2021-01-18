import 'package:flutter/material.dart';
import 'package:flutter_application_1/bv_inicio_admin.dart';
import 'package:flutter_application_1/bv_inicio_empleado.dart';
import 'package:flutter_application_1/bv_inicio_cliente.dart';
import 'dart:async';
import 'dart:convert';
import 'package:http/http.dart' as http;

class GenericResponse {
  int statusCode;
  String message;
  dynamic data;
  GenericResponse({this.statusCode, this.message, this.data});
}

GenericResponse _genericResponseFromJson(
    int statusCode, String message, dynamic data) {
  var genericResponse = new GenericResponse();
  genericResponse.statusCode = statusCode;
  genericResponse.message = message;
  genericResponse.data = data;
  return genericResponse;
}

class peticion extends StatelessWidget {
  Future<String> pedidos() async {
    final resp = await http
        .get('http://localhost:8080/BancaVirtualF/ws/clientes/listarclientes');
    print(resp);
  }
}

class Login extends StatelessWidget {
  const Login({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final _headers = {'Content-Type': 'application/json'};

    // This method is rerun every time setState is called, for instance as done
    // by the _incrementCounter method above.
    //
    // The Flutter framework has been optimized to make rerunning build methods
    // fast, so that you can just rebuild anything that needs updating rather
    // than having to individually change instances of widgets.
    return Scaffold(
      appBar: AppBar(
        // Here we take the value from the MyHomePage object that was created by
        // the App.build method, and use it to set our appbar title.
        title: Text('LOGIN USUARIO'),
      ),
      body: Center(
        child: Text("INGRESE USUARIO"),
      ),
      bottomNavigationBar: BottomNavigationBar(
        items: const <BottomNavigationBarItem>[
          BottomNavigationBarItem(
            icon: Icon(Icons.home),
            label: 'Home',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.business),
            label: 'Business',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.school),
            label: 'School',
          ),
        ],
      ),
      drawer: Drawer(
        child: ListView(
          padding: EdgeInsets.zero,
          children: const <Widget>[
            DrawerHeader(
              decoration: BoxDecoration(
                color: Colors.brown,
              ),
              child: Text(
                'Login Usuario',
                style: TextStyle(
                  color: Colors.white,
                  fontSize: 24,
                ),
              ),
            ),
            ListTile(
              leading: Icon(Icons.account_circle),
              title: Text('Transferencia'),
            ),
            ListTile(
              leading: Icon(Icons.settings),
              title: Text('Actualizacion Registro'),
            ),
          ],
        ),
      ),
      // This trailing comma makes auto-formatting nicer for build methods.
    );
  }
}
