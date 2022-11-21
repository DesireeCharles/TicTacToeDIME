import 'package:angular/angular.dart';
import 'package:angular_router/angular_router.dart';
import 'package:app/src/app.template.dart' as ng;

import 'main.template.dart' as self;

@GenerateInjector(routerProviders)
final InjectorFactory injector = self.injector$Injector;

@GenerateInjector(routerProvidersHash)
final InjectorFactory injectorLocal = self.injectorLocal$Injector;

void main() {
  final local = const bool.fromEnvironment('local', defaultValue: true);
  print(local);
  if (local) {
    runApp(ng.AppComponentNgFactory, createInjector: injectorLocal);
  } else {
    runApp(ng.AppComponentNgFactory, createInjector: injector);
  }
}
