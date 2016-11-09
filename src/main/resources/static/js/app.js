var React = require('react');
var welcomeText = React.createClass({

    render: function () {
    return (
    <div>
        product catalog
    </div>
                    );
    }
    });
    var element = React.createElement(welcomeText);
        React.render(element, document.body);