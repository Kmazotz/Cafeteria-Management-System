using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataServices.Connectors
{
    public class MySQLConnector : DBConnector
    {
        public MySQLConnector(string server, string dataBase, int port, string user, string password) : base(server, dataBase, port, user, password)
        {
        }

        public override bool CloseConnection()
        {
            throw new NotImplementedException();
        }

        public override void DeleteQuery(string table)
        {
            throw new NotImplementedException();
        }

        public override T ExecuteFunction<T>(string func, params string[] parameters)
        {
            throw new NotImplementedException();
        }

        public override void ExecuteProcedure<T>(string proc, out T returns, params string[] parameters)
        {
            throw new NotImplementedException();
        }

        public override void InsertQuery(string table, string fields, string values)
        {
            throw new NotImplementedException();
        }

        public override bool OpenConnection()
        {
            throw new NotImplementedException();
        }

        public override IEnumerable<string> SelectAllQuery(string table)
        {
            throw new NotImplementedException();
        }

        public override IEnumerable<string> SelectQuery(string table, string fields)
        {
            throw new NotImplementedException();
        }

        public override void UpdateQuery(string table, string values)
        {
            throw new NotImplementedException();
        }

    }
}
