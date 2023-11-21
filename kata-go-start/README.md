# kata-go-start

## Prerequisites

* Go is installed (I used version 1.13)
* You have an editor for go installed. Some ideas:
  * [Goland](https://www.jetbrains.com/go/).
  * [IntelliJ Ultimate](https://www.jetbrains.com/idea/) with the Go plugin.
  * [Visual Studio code](https://code.visualstudio.com/) with plugins [Microsft Go plugin](https://github.com/Microsoft/vscode-go).
  * Your favorite editor with a plugin.

### Check your go installation

Some commands that can help you get to the correct version:

```bash
go version # See the current go version
brew install go # to install
brew upgrade go # to update to a newer version
```

## Running

```bash
go run main.go

go fmt ./
go test ./
```

## Some tips

* Test functions need to be prefixed with "Test"
* More about the assertions used <https://github.com/stretchr/testify>
