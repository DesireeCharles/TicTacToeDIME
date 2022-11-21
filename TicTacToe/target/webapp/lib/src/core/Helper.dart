import 'dart:html' as html;

import 'package:angular/core.dart';
import 'package:angular_router/angular_router.dart';
import 'package:app/src/core/AbstractRoutes.dart';

@Component(selector: 'not-found', template: '''
      <h1>404 Page not found</h1>
    ''')
class NotFound implements OnInit {
  @override
  void ngOnInit() {
    html.document.title = '404';
  }
}

@Component(selector: 'maintenance', styleUrls: ['helper.css'], template: '''
      <article>
	    <h1>We&rsquo;ll be back soon!</h1>
	    <div>
	        <p>
	        	Sorry for the inconvenience but we&rsquo;re performing some maintenance at the moment.
	        	We&rsquo;ll be back online shortly!
	        </p>
	        <p>&mdash; The Team</p>
	    </div>
	</article>
    ''')
class Maintenance implements OnInit, OnActivate {
  final Router _router;
  final AbstractRoutes routes;

  Maintenance(this._router, this.routes);

  @override
  void ngOnInit() {
    html.document.title = 'Maintenance';
  }

  @override
  void onActivate(RouterState current, RouterState next) {
    if (current == null) {
      _router.navigate(routes.getByName('root').toUrl());
    }
  }
}

@Component(selector: 'error-found', template: '''
      <h1 style="margin-left: 20%;font-size: 120pt;">:(</h1>
      <h1 style="margin-left: 20%;">The App ran into a problem that it couldn't</h1>
      <h1 style="margin-left: 20%;">handle, the developers are notified.</h1>
    ''')
class ErrorFound implements OnInit {
  @override
  void ngOnInit() {
    html.document.title = ':(';
  }
}

@Component(selector: 'termination', template: '''
      <h1>End Sib {{endSib}} of root process reached</h1>
    ''')
class Termination implements OnActivate {
  String endSib;

  @override
  void onActivate(RouterState previous, RouterState current) {
    endSib = current.parameters['branchName'];
    html.document.title = endSib;
  }
}
