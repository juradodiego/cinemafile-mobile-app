import 'package:flutter/material.dart';
import 'package:mobile_client/viewModel/movies_list_view_model.dart';
import 'package:mobile_client/widgets/movies_list.dart';


import 'package:provider/provider.dart';

class MovieListScreen extends StatefulWidget {
  @override
  _MovieListScreenState createState() => _MovieListScreenState();
}

class _MovieListScreenState extends State<MovieListScreen> {

  final TextEditingController _controller = TextEditingController();

  @override
  void initState() {
    super.initState();
    Provider.of<MovieListViewModel>(context, listen: false).fetchMovies("iron man");
//you can use anything you like or not use anything here. I call it just to have a content on the screen rather than having a blank screen
  }

  @override
  Widget build(BuildContext context) {

    final vm = Provider.of<MovieListViewModel>(context);

    return Scaffold(
        appBar: AppBar(
            title: Text("Movies MVVM Example")
        ),
        body: Container(
            padding: EdgeInsets.all(10),
            width: MediaQuery.of(context).size.width,
            height: MediaQuery.of(context).size.height,
            child: Column(children: <Widget>[
              Container(
                padding: EdgeInsets.only(left: 10),
                decoration: BoxDecoration(
                    color: Colors.grey,
                    borderRadius: BorderRadius.circular(10)
                ),
                child: TextField(
                  controller: _controller,
                  onSubmitted: (value) {
                    if(value.isNotEmpty) {
                      vm.fetchMovies(value);
                      _controller.clear();
                    }
                  },
                  style: TextStyle(color: Colors.white),
                  decoration: InputDecoration(
                      hintText: "Search",
                      hintStyle: TextStyle(color: Colors.white),
                      border: InputBorder.none
                  ),

                ),
              ),
              Expanded(
                  child: MovieList(movies: vm.movies))//we will create this further down
            ])
        )

    );
  }
}