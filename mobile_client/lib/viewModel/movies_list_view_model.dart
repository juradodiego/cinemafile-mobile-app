import 'package:flutter/material.dart';
import 'package:mobile_client/service/web_service.dart';
import 'package:mobile_client/viewModel/movie_view_model.dart';

class MovieListViewModel extends ChangeNotifier {

  List<MovieViewModel> movies = <MovieViewModel>[];

  Future<void> fetchMovies(String keyword) async {
    final results =  await Webservice().fetchMovies(keyword);
    movies = results.map((item) => MovieViewModel(movie: item)).toList();
    notifyListeners();
  }

}