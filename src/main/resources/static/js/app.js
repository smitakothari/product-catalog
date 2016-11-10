var React = require('react');
var $ = require ('jquery');
var welcomeText = React.createClass({

    getInitialState: function () {
         return {
                productData: '',
         }
    },


    componentWillMount: function () {
        var self = this;

        $.ajax({
                type: 'get',
                url: 'products'
            })
            .done(function (data) {
                self.setState({productData: data[0]});
                //self.setState({empUid: data.userAuthentication.details.sAMAccountName});
                //self.setState({empUid: 'rclark'}); // this only to run in local environment
                //self.setState({loaderimage: ''});
            })
            .fail(function (data) {
            });

    },

    render: function () {
    return (
    <div>
        product catalog:
        {this.state.productData.productId}
    </div>
                    );
    }
    });
    var element = React.createElement(welcomeText);
        React.render(element, document.body);