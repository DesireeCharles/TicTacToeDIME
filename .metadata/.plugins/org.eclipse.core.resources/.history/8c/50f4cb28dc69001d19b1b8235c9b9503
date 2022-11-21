class NoSuchPropertyException implements Exception {
  final String message;

  NoSuchPropertyException([this.message = '']);

  @override
  String toString() {
    if (message != '') {
      return 'Failed to access class property: ${message}';
    }
    return 'Failed to access class property';
  }
}
